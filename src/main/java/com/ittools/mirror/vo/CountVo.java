package com.ittools.mirror.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountVo {
    private long totalVisitTime;
    private float totalSize;
    private long totalUserNum;
    private float avgSpeed;
}
