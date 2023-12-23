class Solution {

    public boolean isPathCrossing(String path) {
        Set<String> visitedPoints = new HashSet<>();
        int x = 0;
        int y = 0;
        visitedPoints.add(x + "," + y);

        for (char currentDirection : path.toCharArray()) {
            if (currentDirection == 'N') {
                y += 1;
            } else if (currentDirection == 'S') {
                y -= 1;
            } else if (currentDirection == 'E') {
                x += 1;
            } else {
                x -= 1;
            }
            String point = x + "," + y;
            if (visitedPoints.contains(point)) {
                return true;
            } else {
                visitedPoints.add(point);
            }
        }

        return false;
    }
}
