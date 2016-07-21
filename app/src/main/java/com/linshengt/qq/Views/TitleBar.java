package com.linshengt.qq.Views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.linshengt.qq.R;
import com.linshengt.qq.Util.SystemMethod;

/**
 * Created by linshengt on 2016/7/20.
 */
public class TitleBar extends RelativeLayout{
    private Context context;
    private Button btnTitleBack;
    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        initView();
    }

    private void initView(){
        LayoutInflater.from(context).inflate(R.layout.comm_title_layout, this);
        btnTitleBack = (Button) findViewById(R.id.btn_title_back);


    }

    public void setBtnTitleBack(int icon,String txtRes){
        Drawable img=context.getResources().getDrawable(icon);
        int height= SystemMethod.dip2px(context, 20);
        int width=img.getIntrinsicWidth()*height/img.getIntrinsicHeight();
        img.setBounds(0, 0, width, height);
        btnTitleBack.setText(txtRes);
        btnTitleBack.setCompoundDrawables(img, null, null, null);
    }

    public void setBtnTitleBackOnClickListenr(OnClickListener onClickListenr){
        btnTitleBack.setOnClickListener(onClickListenr);
    }

}
