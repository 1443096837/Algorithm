package stack.zhaozheng.club;

public class Queen {
	int x, y;

	public Queen(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		// 重载equals函数,判断皇后之间是否能够相互攻击
		Queen queen = (Queen) obj;
		if (queen.x == x | queen.y == y || queen.x - queen.y == x - y || queen.x + queen.y == x + y) {
			return true;
		}
		return false;
	}

}
