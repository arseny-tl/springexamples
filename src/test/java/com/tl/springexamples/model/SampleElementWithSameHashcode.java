package com.tl.springexamples.model;

import java.util.Objects;

public class SampleElementWithSameHashcode {

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SampleElementWithSameHashcode)) {
      return false;
    }
    SampleElementWithSameHashcode that = (SampleElementWithSameHashcode) o;
    return Objects.equals(getId(), that.getId());
  }
}
