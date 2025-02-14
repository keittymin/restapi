package com.api.restapi.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    private String c_cd;
    private String c_cd_nm;
    private String cp_cd;
    private String cp_cd_nm;
    private String old_emp_id;
    private String emp_id;
    private String emp_nm;
    private String eng_emp_nm;
    private String org_id;
    private String org_nm;
    private String org_lev;
    private String par_org_id;
    private String par_org_nm;
    private String bizpl_cd;
    private String bizpl_nm;
    private String emp_grade_cd;
    private String emp_grade_nm;
    private String emp_grade_ycnt;
    private String duty_cd;
    private String duty_nm;
    private String sal_step_cd;
    private String sal_step_nm;
    private String sal_step_ycnt;
    private String job_id;
    private String job_nm;
    private String emp_type;
    private String emp_type_nm;
    private String grp_emp_type;
    private String grp_emp_type_nm;
    private String egm_form;
    private String egm_form_nm;
    private String link_jg_cd;
    private String link_jg_nm;
    private String link_emp_grade_cd;
    private String link_emp_grade_nm;
    private String job_txt;
    private String appnt_type;
    private String appnt_type_nm;
    private String appnt_cd;
    private String appnt_nm;
    private String sta_ymd;
    private String end_ymd;
    private String last_move_ymd;
    private String last_prom_ymd;
    private String sal_step_ymd;
    private String duty_app_ymd;
    private String grp_ymd;
    private String enter_ymd;
    private String retire_ymd;
    private String stat_cd;
    private String stat_nm;
    private String emp_sch_yn;
    private String offi_mail;
    private String office_tel_no;
    private String fax_no;
    private String office_zip_no;
    private String office_addr;
    private String office_dtl_addr;
    private String mail;
    private String mobile_no;
    private String tel_no;
    private String gender_type;
    private String zip_no;
    private String addr;
    private String dtl_addr;
    private String lns_type;
    private String birth_ymd;
    private String rrn_birth_ymd;
    private String marry_ymd;
    private String per_no;
    private String enc_per_no;
    private String photo_url;
    private String ins_ymdhms;
    private String mod_ymdhms;
}