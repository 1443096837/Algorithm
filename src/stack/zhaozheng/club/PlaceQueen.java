package stack.zhaozheng.club;

import java.util.Stack;

public class PlaceQueen {
	int place(int n) {
		int num = 0;// �������
		Queen test = new Queen(1, 1);// �½�һ������ʺ�
		Stack<Queen> solu = new Stack<Queen>();
		while (!(solu.isEmpty() && test.y > n)) {
			if (solu.size() >= n || test.y > n) { // ����
				test = solu.pop();
				test.y++;
			} else { // ��̽
				while (test.y <= n && solu.contains(test)) {
					test.y++;
				}
				if (test.y <= n) {
					solu.push(test);
					if (solu.size() >= n) { // �Ѿ��ɹ�
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
