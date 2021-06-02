package lotto.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public int money() {
        System.out.println("구매금액을 입력해 주세요.");
        return inputMoney();
    }

    private int inputMoney() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("구매금액은 정수만 입력 가능합니다. 구매 금액을 다시 입력해 주세요.");
            scanner = new Scanner(System.in);
            return inputMoney();
        }
    }

    public int manualBuyCount() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("수동 구매 개수는 정수만 입력 가능합니다.");
            scanner = new Scanner(System.in);
            return manualBuyCount();
        }
    }

    public String numbers() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return scanner.nextLine();
    }

    public int bonusBall() {

        System.out.println("보너스 볼을 입력해 주세요.");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("보너스 볼은 정수만 입력 가능합니다.");
            scanner = new Scanner(System.in);
            return bonusBall();
        }
    }

    public List<String> manualBuy(int manualBuyCount) {

        List<String> manualBuyCounts = new ArrayList<>();
        scanner.nextLine();
        System.out.println("수동으로 구매할 번호를 입력해 주세요");

        for (int i = 0; i < manualBuyCount; i++) {
            manualBuyCounts.add(scanner.nextLine());
        }
        System.out.println();

        return manualBuyCounts;
    }
}
