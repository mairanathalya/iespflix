package com.mairanath.iesp.iespflix.service;

import com.mairanath.iesp.iespflix.repository.SerieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SerieService {
    @Autowired
    private SerieRepository repository;


}
