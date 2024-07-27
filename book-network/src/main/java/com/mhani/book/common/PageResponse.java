package com.mhani.book.common;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageResponse<T> {

    private List<T> result;
    private int number;
    private int size;
    private long total;
    private int totalPages;
    private boolean first;
    private boolean last;
}
