package com.yhzdys.learning.designpattern.e_prototype.product;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class IPhoneX implements ProtoType {
    protected List<String> parts;

    public void design() {
        parts.add("刘海");
        parts.add("全面屏");
        parts.add("竖排双摄");
    }

    @Override
    public ProtoType copy() {
        ArrayList<String> parts = new ArrayList<>(this.parts);
        return new IPhoneX(parts);
    }

    public IPhoneX() {
        this.parts = new ArrayList<>();
    }

    public IPhoneX(List<String> parts) {
        this.parts = parts;
    }
}
