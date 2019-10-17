package com.topsail.sso.ui.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Steven
 */
@Data
@Builder
public class Member {

    private String name;

    private String code;

    private Integer gender;

    private String mobile;
}
