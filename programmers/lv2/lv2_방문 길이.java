class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
		String[] location = new String[dirs.length() * 2];
		int answer = dirs.length();
		String sum1 = "", sum2 = "";

		for (int i = 0; i < dirs.length(); i++) {
			char ch = dirs.charAt(i);
			sum1 = (x + "") + (y + "");

			switch (ch) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'R':
				x++;
				break;
			case 'L':
				x--;
				break;
			}

			if (x > 5)
				x = 5;
			if (x < -5)
				x = -5;
			if (y > 5)
				y = 5;
			if (y < -5)
				y = -5;

			sum2 = (x + "") + (y + "") + sum1;
			sum1 += (x + "") + (y + "");

			for (int j = 0; j < location.length; j++) {
				if (sum2.equals(sum1)) {
					answer--;
					break;
				} else if (sum1.equals(location[j]) || sum2.equals(location[j])) {
					answer--;
					break;
				}
			}
			location[i] = sum1;
			location[i + dirs.length()] = sum2;
		}        
        return answer;
    }
}