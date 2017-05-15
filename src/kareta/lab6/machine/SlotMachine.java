package kareta.lab6.machine;

import kareta.lab6.machine.states.LoseState;
import kareta.lab6.machine.states.ReadyState;
import kareta.lab6.machine.states.State;
import kareta.lab6.machine.states.WinState;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vitya on 01.04.17.
 */
public class SlotMachine {

    private Random random = new Random();

    private State state = new ReadyState();

    private MoneyCounter moneyCounter = new MoneyCounter();
    private int lastMoney;
    private Image betImage = Image.BANANA;

    public Roller[] rollers = new Roller[] {new Roller(), new Roller(), new Roller()};
    public Image[] result = new Image[] {Image.BANANA, Image.CHERRY, Image.LEMON};

    public void start() {
        int randomInt = Math.abs(random.nextInt()) % Image.values().length;
        result[0] = Image.values()[randomInt];

        randomInt = Math.abs(random.nextInt()) % Image.values().length;
        result[1] = Image.values()[randomInt];

        randomInt = Math.abs(random.nextInt()) % Image.values().length;
        result[2] = Image.values()[randomInt];

        if ((result[0] == betImage || result[1] == betImage || result[2] == betImage) && lastMoney >= 5) {
            setState(new  WinState());
            return;
        }

        if (result[0] == betImage && result[1] == betImage && result[2] == betImage && lastMoney >= 1) {
            setState(new WinState());
            return;
        }

        setState(new LoseState());

    }

    public void consumeMoney(int money) {
        lastMoney = money;
        moneyCounter.money.add(money);
    }

    public void setBetImage(Image image) {
        betImage = image;
    }

    public void printStatus() {
        state.doAction(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printMoney() {
        System.out.println("Money is " + moneyCounter.count());
    }

    @Override
    public String toString() {
        return "SlotMachine{" +
                "result=" + Arrays.toString(result) +
                '}';
    }
}
