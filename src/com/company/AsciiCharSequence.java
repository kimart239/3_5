package com.company;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
    private byte[] y;

    public AsciiCharSequence(byte[] x) {
        y = x.clone();
    }
    public String toString(){
           return new String(y);
    }
    @Override
    public int length () {
            return y.length;
    }
    @Override
    public char charAt( int index){
            return (char)(y[index]);
    }
    @Override
    public CharSequence subSequence ( int start, int end){
            return new AsciiCharSequence(Arrays.copyOfRange(y, start, end));
    }
}

