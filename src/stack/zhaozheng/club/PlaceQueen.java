package stack.zhaozheng.club;

import java.util.Stack;

public class PlaceQueen {
	int place(int n) {
		int num = 0;// 解的数量
		Queen test = new Queen(1, 1);// 新建一个试验皇后
		Stack<Queen> solu = new Stack<Queen>();
		while (!(solu.isEmpty() && test.y > n)) {
			if (solu.size() >= n || test.y > n) { // 回溯
				test = solu.pop();
				test.y++;
			} else { // 试探
				while (test.y <= n && solu.contains(test)) {
					test.y++;
				}
				if (test.y <= n) {
					solu.push(test);
					if (solu.size() >= n) { // 已经成功
						num++;
					} else {
						test = new Queen(solu.peek().x + 1, 1);
					}
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(new PlaceQueen().place(8));//92
	}
}
