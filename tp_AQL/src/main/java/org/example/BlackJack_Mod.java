package org.example;
public class BlackJack_Mod {

    public int play(int left, int right) {
        int ln = left;
        int rn = right;
        if(ln > 21)
            ln = 0;
        if(rn > 21)
            rn = 0;
        if(ln > rn)
            return rn;
        else
            return ln;
    }
}