package Javapaid.Graphs;

public class FloodFillAlgo {
    public static void helper(int [][] image, int sr, int sc, int color, boolean[][] vis,int ogColor){
        if (sr<0 ||sc<0 ||sr>= image.length||sc>=image[0].length||vis[sr][sc]||image[sr][sc]!=ogColor){
            return;
        }
        image[sr][sc] = color;

        //left
        helper(image, sr, sc-1, color, vis, ogColor);
        //right
        helper(image, sr, sc+1, color, vis, ogColor);
        //up
        helper(image, sr-1, sc, color, vis, ogColor);
        //down
        helper(image, sr+1, sc, color, vis, ogColor);

    }
    public  int [][] floodFill(int[][] image, int sr, int sc, int color){
        boolean[][]vis = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

    }
}
