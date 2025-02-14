package com.api.restapi.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CommonCode
{
    private String c_cd;
    private String cd;
    private String cd_nm;
    private String use_yn;
    private String dp_order;
}