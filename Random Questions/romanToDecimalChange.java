import java.io.*;

class romanToDecimalChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
        br.close();
    }
}

class Solution {
    public int romanToDecimal(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) != str.length()) {
                if (str.charAt(i) == 'I') {
                    if ((str.charAt(i + 1) == 'V') || (str.charAt(i + 1) == 'X') || (str.charAt(i + 1) == 'L')
                            || (str.charAt(i + 1) == 'C') || (str.charAt(i + 1) == 'D') || (str.charAt(i + 1) == 'M')) {
                        ans -= 1;
                    } else {
                        ans += 1;
                    }
                } else if (str.charAt(i) == 'V') {
                    if ((str.charAt(i + 1) == 'X') || (str.charAt(i + 1) == 'L') || (str.charAt(i + 1) == 'C')
                            || (str.charAt(i + 1) == 'D') || (str.charAt(i + 1) == 'M')) {
                        ans -= 5;
                    } else {
                        ans += 5;
                    }
                } else if (str.charAt(i) == 'X') {
                    if ((str.charAt(i + 1) == 'L') || (str.charAt(i + 1) == 'C') || (str.charAt(i + 1) == 'D')
                            || (str.charAt(i + 1) == 'M')) {
                        ans -= 10;
                    } else {
                        ans += 10;
                    }
                } else if (str.charAt(i) == 'L') {
                    if ((str.charAt(i + 1) == 'C') || (str.charAt(i + 1) == 'D') || (str.charAt(i + 1) == 'M')) {
                        ans -= 50;
                    } else {
                        ans += 50;
                    }
                } else if (str.charAt(i) == 'C') {
                    if ((str.charAt(i + 1) == 'D') || (str.charAt(i + 1) == 'M')) {
                        ans -= 100;
                    } else {
                        ans += 100;
                    }
                } else if (str.charAt(i) == 'D') {
                    if (str.charAt(i + 1) == 'M') {
                        ans -= 500;
                    } else {
                        ans += 500;
                    }
                } else if (str.charAt(i) == 'M') {
                    ans += 1000;
                }
            } else {
                if (str.charAt(i) == 'I') {
                    ans += 1;
                } else if (str.charAt(i) == 'V') {
                    ans += 5;
                } else if (str.charAt(i) == 'X') {
                    ans += 10;
                } else if (str.charAt(i) == 'L') {
                    ans += 50;
                } else if (str.charAt(i) == 'C') {
                    ans += 100;
                } else if (str.charAt(i) == 'D') {
                    ans += 500;
                } else if (str.charAt(i) == 'M') {
                    ans += 1000;
                }
            }
        }
        return ans;
    }
}