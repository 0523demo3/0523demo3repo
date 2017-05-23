package com.bawei.rxjavademo.ss.bean;


import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    private static Toast toast;
    private static ToastUtil toastUtil;
    private String msg;
    private ToastUtil() {

    }
    //吐丝单列
    public static ToastUtil getToastUtil()
    {
        if(toastUtil==null)
        {
            synchronized (ToastUtil.class)
            {
                if(toastUtil==null)
                {
                    toastUtil=new ToastUtil();

                }
            }
        }
        return  toastUtil;
    }
    public static void showShort(final Context context,final String msg)
    {
       if(toast==null)
       {
       toast  =  Toast.makeText(context,msg,Toast.LENGTH_SHORT);
       }
        else
       {
           toast.cancel();
           toast  =  Toast.makeText(context,msg,Toast.LENGTH_SHORT);
       }
        toast.show();
    }
    public static void showLong(final Context context,final String msg)
    {
        if(toast==null)
        {
            toast  =  Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }
        else
        {
            toast.cancel();
            toast  =  Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }
        toast.show();
    }


}
