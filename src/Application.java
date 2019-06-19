import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Machine machine1 = new Machine("A", 100);
		Machine machine2 = new Machine("B", 120);
		Machine machine3 = new Machine("C", 90);

		String userInput = null;
		final String A = "A";
		final String B = "B";
		final String C = "C";
		final String E = "E";
		do {
			System.out.println("いらっしゃいませ");
			System.out.println("A:100円");
			System.out.println("B:120円");
			System.out.println("C:90円");
			System.out.println("商品名を入力してください");

			Scanner scan = new Scanner(System.in);
			String goods = scan.nextLine();
			goods = goods.replaceAll("\\s", "");
			Machine selected = null;

			switch (goods) {
			case A:
				selected = machine1;
				break;
			case B:
				selected = machine2;
				break;
			case C:
				selected = machine3;
				break;
			}
			
			if (selected==null) {
				System.out.println("A-Cの商品名を入力して下さい");
				System.out.println("ありがとうございました");
				return;
			}
			
			System.out.println("お金を入れてください");
			while (!scan.hasNextInt()) {
				String input = scan.next();
				System.out.printf("\"%s\" の入力はできないです。もう一度お願いします。\n", input);
			}
			int money = scan.nextInt();
			if (money > 10000) {
				System.out.println("お金は１００００以下のお金を入れてください！");
				System.out.println("ありがとうございました");
				return;
			}
			int rest = selected.change(money);
			String g = selected.getDrink();
			if (rest >= 0) {
				System.out.println("商品名:" + g + " " + "お釣り:" + rest + "円");
				System.out.println("もう一つを買いたいなら　C　を入力してください。買いたくないなら　E を入力してください。");
				userInput = scan.next();
			} else {
				System.out.println("お金が足りません");
				System.out.println("ありがとうございました");
				return;
			}
		} while (!userInput.equals("E") && userInput.equals("C"));
		{
			System.out.println("ありがとうございました");
		}

	}
}
