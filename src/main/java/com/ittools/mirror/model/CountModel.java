package com.ittools.mirror.model;

import com.ittools.mirror.vo.CountVo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountModel extends CountVo {
    private long id;
    private Date updatedAt;
    private Date createdAt;
}
