package com.iqkv.incubator.sample.mixnetflixoss.userprofile.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum Downstream {

  DEPARTMENT_SERVICE("department-service");

  private final String name;
}