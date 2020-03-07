package com.ittools.mirror.model;

import com.ittools.mirror.vo.MirrorVo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MirrorModel extends MirrorVo {
    private long id;
    private Date updatedAt;
    private Date createdAt;
}
