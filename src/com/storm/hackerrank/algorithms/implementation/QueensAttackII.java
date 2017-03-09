package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class QueensAttackII {

    public static void main(String[] args) {

        /*
            A queen is standing on an n x n chessboard. A square on the board is denoted (row, column).  The queen stands
            at (r[q], c[q]) and can attack in 8 directions.  There are k obstacles on the chessboard preventing the queen
            from attacking any square that has an obstacle blocking the queen's path to it.

            Given the queen's position and the position of the obstacles, find and print the number of squares the queen can attack.

            Input:
            n k
            r[q] r[c]
            r[i] c[i] (appears n times)

            A cell can have more than one obstacle, but there will never be an obstacle located at the queen's position
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int k = in.nextInt();
        int qRow = in.nextInt();
        int qCol = in.nextInt();
        //distance in direction
        int north = n - qRow;
        int east = n - qCol;
        int south = qRow - 1;
        int west = qCol - 1;
        int northeast = Math.min(north, east);
        int southeast = Math.min(south, east);
        int southwest = Math.min(south, west);
        int northwest = Math.min(north, west);
        for (int i = 0; i < k; i++) {
            int oRow = in.nextInt();
            int oCol = in.nextInt();

            int nd = northDistance(qRow, qCol, oRow, oCol);
            if (nd > -1 && nd < north) {
                north = nd;
                continue;
            }

            int ned = northEastDistance(qRow, qCol, oRow, oCol);
            if (ned > -1 && ned < northeast) {
                northeast = ned;
                continue;
            }

            int ed = eastDistance(qRow, qCol, oRow, oCol);
            if (ed > -1 && ed < east) {
                east = ed;
                continue;
            }

            int sed = southEastDistance(qRow, qCol, oRow, oCol);
            if (sed > -1 && sed < southeast) {
                southeast = sed;
                continue;
            }

            int sd = southDistance(qRow, qCol, oRow, oCol);
            if (sd > -1 && sd < south) {
                south = sd;
                continue;
            }

            int swd = southWestDistance(qRow, qCol, oRow, oCol);
            if (swd > -1 && swd < southwest) {
                southwest = swd;
                continue;
            }

            int wd = westDistance(qRow, qCol, oRow, oCol);
            if (wd > -1 && wd < west) {
                west = wd;
                continue;
            }

            int nwd = northWestDistance(qRow, qCol, oRow, oCol);
            if (nwd > -1 && nwd < northwest) {
                northwest = nwd;
                continue;
            }
        }

        System.out.println(north + northeast + east + southeast + south + southwest + west + northwest);
    }

    private static int northDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol == oCol && qRow < oRow)
            return oRow - qRow - 1;
        return -1;
    }

    private static int northEastDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol < oCol && qRow < oRow && oCol - qCol == oRow - qRow)
            return oRow - qRow - 1;
        return -1;
    }

    private static int eastDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qRow == oRow && qCol < oCol)
            return oCol - qCol - 1;
        return -1;
    }

    private static int southEastDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol < oCol && qRow > oRow && oCol - qCol == qRow - oRow)
            return oCol - qCol - 1;
        return -1;
    }

    private static int southDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol == oCol && qRow > oRow)
            return qRow - oRow - 1;
        return -1;
    }

    private static int southWestDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol > oCol && qRow > oRow && qCol - oCol == qRow - oRow)
            return qRow - oRow - 1;
        return -1;
    }

    private static int westDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qRow == oRow && qCol > oCol)
            return qCol - oCol - 1;
        return -1;
    }

    private static int northWestDistance(int qRow, int qCol, int oRow, int oCol) {
        if (qCol > oCol && qRow < oRow && qCol - oCol == oRow - qRow)
            return qCol - oCol - 1;
        return -1;
    }
}
