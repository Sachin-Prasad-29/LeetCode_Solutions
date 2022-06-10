class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int scr_Color = image[sr][sc];
        if(scr_Color == newColor) return image;
        dfs(image,sr,sc,newColor,scr_Color);
        return image;
    }
    private static void dfs(int[][] image, int sr,int sc, int newColor, int scr_Color){
        //base condition
        if(sr<0 || sr > image.length-1 || sc < 0 || sc > image[0].length-1) return;
        if(image[sr][sc] != scr_Color) return ;
        image[sr][sc] = newColor;
        dfs(image,sr-1,sc,newColor,scr_Color);
        dfs(image,sr+1,sc,newColor,scr_Color);
        dfs(image,sr,sc-1,newColor,scr_Color);
        dfs(image,sr,sc+1,newColor,scr_Color);
    }
}