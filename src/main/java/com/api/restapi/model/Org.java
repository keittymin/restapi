package com.api.restapi.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Org
{
    private String c_cd;
    private String org_id;
    private String org_nm;
    private String par_org_id;
    private String par_org_nm;
    private String org_lev;
    private String sta_ymd;
    private String end_ymd;
    private String mod_ymdhms;
    private String dp_order;
    private String pas_cd;
}