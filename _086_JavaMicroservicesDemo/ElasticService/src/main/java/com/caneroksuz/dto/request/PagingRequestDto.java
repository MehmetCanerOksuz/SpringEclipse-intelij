package com.caneroksuz.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagingRequestDto {

    private Integer pageSize; // bir istekte listelenecek kayıt sayısı

    private Integer currentPage; // suanda ki bulundugun kayıt sayısı

    private String sortParameter; // hangi alana göre sıralayacağız

    private String direction; //ASC, DESC
}
