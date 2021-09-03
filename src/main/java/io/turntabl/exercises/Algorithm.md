Go through each row 

add the prent node to the adjacent child

            Triangle[][]                   res[][]

0                3                          3
1                4 5                        7 8 
2                5 7 9                      12 15 17
3                6 11 1 2                   18 26 18 19

Max = 26

res[triangle.length]
foreach (rows: row){
for (r = 0; r < res.length; r++>)
    a[row][r] = res[r]+ a[row][r]
    a[row][r+1] = res[r]+ a[row][r+1]
}

<!-- foreach (a[0]){b: a[0]b[0] + a[1][b] && a[0]b[0] + a[1][b+1]} -->