package com.caneroksuz.service;

import com.caneroksuz.dto.request.UrunSaveRequestDto;
import com.caneroksuz.dto.response.UrunFindAllResponseDto;
import com.caneroksuz.mapper.IUrunMapper;
import com.caneroksuz.repository.IUrunRepository;
import com.caneroksuz.repository.entity.Urun;
import com.caneroksuz.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrunService extends ServiceManager<Urun,Long> {

    private final IUrunRepository repository;

    public UrunService(IUrunRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public void saveDto(UrunSaveRequestDto dto){
        save(IUrunMapper.INSTANCE.toUrun(dto));
    }

    public List<UrunFindAllResponseDto> findAllResponseDto(){
        List<UrunFindAllResponseDto> liste=new ArrayList<>();
        findAll().forEach(x->{
            liste.add(
                    IUrunMapper.INSTANCE.fromUrun(x));
        });
        return liste;
    }

    public List<String> findByIdIn(List<Long> ids){
        List<String> urunadlar=new ArrayList<>();
        List<Urun> urunList= repository.findAllById(ids);
        urunList.stream().forEach(x->{
            urunadlar.add(x.getAd());
        });
        return urunadlar;
    }


}
