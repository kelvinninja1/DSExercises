package src.main.java.io.turntabl.exercises;

// Think about what data structures out list/array, map/dictionary or set to use to represent the input data, and why. 

// Maximum Path Sum
// By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

// 3                            3               - 0.0*              a = 0 
// 7 4                         7 4              - 1.0* | 1.1        [a+1][a]
// 2 4 6                      2 4 6             - 2.0 | 2.1*        [a+2][a+1]
// 8 5 9 3                   8 5 9 3            - 3.1 | 3.2*        [a+3][a+2] a-1

// That is, 3 + 7 + 4 + 9 = 23.
 
public class TriangleMaxPathSum
{
     
    // Find the max path in triangle
    public static int findMaxPath(int triangle[][])
    {
        // my algo code here
        int sum = triangle[0][0];
        int foldIndex = 0; //fold index

        for(int a = 1; a < triangle.length; a++ ) {
            System.out.println(" First Child is: " + triangle[a][foldIndex] + ", Second Child is: " + triangle[a][foldIndex + 1]);
            // int start = (triangle[a][a-1] > -1) ? a-1 : a ;
            if (triangle[a][foldIndex] > triangle[a][foldIndex + 1]) {
                sum += triangle[a][foldIndex];
                System.out.println(" Chosen First Child is: " + triangle[a][foldIndex]);
                // foldIndex = foldIndex;

            } else {
                sum += triangle[a][foldIndex + 1];
                System.out.println(" Chosen Second Child is: " + triangle[a][foldIndex + 1]);
                foldIndex = foldIndex + 1;
            }
            
        }
        
        return sum;
    }
     
    public static int findMaxPathFromBottom(int triangle[][])
    {
        // my algo code here
        int sum = triangle[0][0];
        int foldIndex = 0; //fold index

        for(int a = 1; a < triangle.length; a++ ) {
            System.out.println(" First Child is: " + triangle[a][a-1] + ", Second Child is: " + triangle[a][a]);
            // int start = (triangle[a][a-1] > -1) ? a-1 : a ;
            if (triangle[a][foldIndex] > triangle[a][foldIndex + 1]) {
                sum += triangle[a][foldIndex];
                System.out.println(" Chosen First Child is: " + triangle[a][foldIndex]);
                // foldIndex = foldIndex;

            } else {
                sum += triangle[a][a];
                System.out.println(" Chosen Second Child is: " + triangle[a][foldIndex + 1]);
                foldIndex = foldIndex + 1;
            }
            
        }
        
        return sum;
    }
     
    public static int findMaxPathStatically(int triangle[][])
    {
        // my algo code here
        int sum = triangle[0][0];
        int foldIndex = 0; //fold index

        for(int a = 1; a < triangle.length; a++ ) {
            if(a == 1)
 
            if (triangle[a][foldIndex] > triangle[a][foldIndex + 1]) {
                sum += triangle[a][foldIndex];
                System.out.println(" Chosen First Child is: " + triangle[a][foldIndex]);
                // foldIndex = foldIndex;

            } else {
                sum += triangle[a][a];
                System.out.println(" Chosen Second Child is: " + triangle[a][foldIndex + 1]);
                foldIndex = foldIndex + 1;
            }
            
        }
        
        return sum;
    }
     


    public static void main (String[] args)
    {

        // Use Test rather
        int triangle[][] = { 
                        { 3 },
                        { 7, 4 },
                        { 2, 4, 6 },
                        { 8, 5, 9, 3 }
                    };
 
        System.out.println(findMaxPath(triangle));
    }
}
 