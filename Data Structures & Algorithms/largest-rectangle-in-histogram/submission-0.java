class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            // On utilise une hauteur de 0 à la fin pour vider la pile
            int currentHeight = (i == n) ? 0 : heights[i];
            
            // Tant que la barre actuelle est plus petite que celle au sommet de la pile
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                // Si la pile est vide, la largeur s'étend jusqu'au début (i)
                // Sinon, elle s'étend du sommet actuel jusqu'à i
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                
                maxArea = Math.max(maxArea, height * width);
            }
            // On ajoute l'indice actuel dans la pile
            stack.push(i);
        }
        
        return maxArea;
    }
}
