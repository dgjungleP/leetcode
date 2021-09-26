package medium;

public class Exist {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char[][] temp = board.clone();
                if (help(temp, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean help(char[][] board, String word, int i, int j, int count) {
        if (count >= word.length()) {
            return true;
        } else {
            if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
                return false;
            }
            board[i][j] = ' ';
            count++;
            boolean result = help(board, word, i - 1, j, count) || help(board, word, i + 1, j, count) || help(board, word, i, j - 1, count) || help(board, word, i, j + 1, count);
            board[i][j] = word.charAt(count - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Exist().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println(new Exist().exist(new char[][]{{'a', 'b'}}, "ba"));
        System.out.println(new Exist().exist(new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}}, "AAB"));
    }
}
