package com.bignerdranch.android.geoquiz;

/**
 * Created by zhaoyang on 2016/12/13.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question,boolean trueQuestion){
        mQuestion=question;
        mTrueQuestion=trueQuestion;
    }
    public int getmQuestion(){
        return mQuestion;
    }

    public void setQuestion(int question){
        mQuestion=question;
    }

    public boolean isTrueQuestion(){
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion=trueQuestion;
    }
}
