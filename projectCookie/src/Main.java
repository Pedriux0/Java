import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// @author Juan Naranjo
public class Main {
    JLabel counterLabel, timeLabel, completeFirstLabel;
    int counter;

    Factory factory = new Factory(); // Instance of the Factory class
    Handler cHandle = new Handler();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        counter = 0;
        createUI();
    }

    public void createUI() {
        JFrame window = new JFrame();
        window.setSize(1600, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        // Layered Pane for proper layering
        JLayeredPane layeredPane = new JLayeredPane();
        window.add(layeredPane);

        // Kitchen background
        JLabel kitchenLabel = new JLabel();
        kitchenLabel.setBounds(0, 0, 1600, 1000);
        kitchenLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("kitchen.png")));
        layeredPane.add(kitchenLabel, Integer.valueOf(0));

        // Chef panel
        JPanel chefPanel = new JPanel();
        chefPanel.setBounds(750, 200, 250, 420);
        chefPanel.setOpaque(false); // Make the panel transparent
        layeredPane.add(chefPanel, Integer.valueOf(1));

        // Chef image
        JLabel chefLabel = new JLabel();
        chefLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("CHEF.png")));
        chefPanel.add(chefLabel);

        // Counter panel
        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(1300, 100, 300, 50);
        counterPanel.setOpaque(false); // Make the panel transparent
        layeredPane.add(counterPanel, Integer.valueOf(2));

        // Counter label with larger font
        counterLabel = new JLabel(counter + " cookies");
        counterLabel.setForeground(Color.orange);
        counterLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        counterPanel.add(counterLabel);

        // Time label
        timeLabel = new JLabel();
        timeLabel.setForeground(Color.black);
        counterPanel.add(timeLabel);

        // Cookie button
        JButton cookieButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("myCookie.png")));
        cookieButton.setBounds(750, 620, 270, 200);
        cookieButton.setContentAreaFilled(false);
        cookieButton.setBorderPainted(false);
        cookieButton.addActionListener(cHandle);
        layeredPane.add(cookieButton, Integer.valueOf(3));

        // Upgrade button
        JButton upgradeButton = new JButton("Upgrade (" + factory.getUpgradeCost() + " cookies)");
        upgradeButton.setBounds(1350, 170, 200, 50);
        upgradeButton.setOpaque(false);
        upgradeButton.setContentAreaFilled(false);
        upgradeButton.setBorderPainted(false);
        upgradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.purchaseUpgrade();
                updateUpgradeButtonLabel(upgradeButton);
            }
        });
        layeredPane.add(upgradeButton, Integer.valueOf(4));

        // "Complete first" label
        completeFirstLabel = new JLabel("Complete first Level ");
        completeFirstLabel.setForeground(Color.red);
        completeFirstLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        completeFirstLabel.setBounds(1400, 250, 200, 50);
        completeFirstLabel.setVisible(false);
        layeredPane.add(completeFirstLabel, Integer.valueOf(5));

        window.setVisible(true);
        updateUpgradeButtonLabel(upgradeButton); // Initial label update
    }

    private void updateUpgradeButtonLabel(JButton upgradeButton) {
        upgradeButton.setText("2X PRODUCTION (" + factory.getUpgradeCost() + " cookies)");
        upgradeButton.setForeground(Color.YELLOW);
    }

    public class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Increment
            counter += factory.produceItems();
            counterLabel.setText(counter + " cookies");

            //  effect on each cookie click (not working )
            playClickSound();

            // First level
            if (counter >= 50) {
                completeFirstLabel.setVisible(true);
            }
        }

        private void playClickSound() {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                        new File("applause_y.wav")); //  path to sound file
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Factory class
    public class Factory {
        private int itemCount;
        private int productionRate;
        private int upgradeCost;
        private int upgradeMultiplier;

        public Factory() {
            itemCount = 0;
            productionRate = 1;
            upgradeCost = 10;
            upgradeMultiplier = 2;
        }

        // producing items
        public int produceItems() {
            itemCount += productionRate;
            return productionRate;
        }

        // purchasing an upgrade
        public void purchaseUpgrade() {
            if (counter >= upgradeCost) {
                counter -= upgradeCost;
                productionRate *= upgradeMultiplier;
                upgradeCost *= upgradeMultiplier;
            }
        }

        // upgrade cost
        public int getUpgradeCost() {
            return upgradeCost;
        }
    }
}
