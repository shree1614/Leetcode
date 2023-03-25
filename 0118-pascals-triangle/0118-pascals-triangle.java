class Solution {
public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> finalList = new ArrayList<>();
    List<Integer> current = null;
    List<Integer> temp = null;
    for (int i = 0; i < numRows; i++) {
        current = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i) {
                current.add(1);
            } else {
                current.add(temp.get(j - 1) + temp.get(j));
            }
        }
        temp = current;
        finalList.add(current);
    }
    return finalList;
	}
}