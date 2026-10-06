class Solution {
    public int countStudents(int[] s, int[] san) {
        int[] count = new int[2];

        for (int i = 0; i < s.length; i++) {
            count[s[i]]++;
        }

        for (int i = 0; i < san.length; i++) {
            if (count[san[i]]== 0) {
                break;

            }
            count[san[i]]--;
            
        }
        return count[0] + count[1];

    }
}