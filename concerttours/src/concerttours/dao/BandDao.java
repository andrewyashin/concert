package concerttours.dao;

import concerttours.model.BandModel;

import java.util.List;

public interface BandDao {
    List<BandModel> findAllBands();
    BandModel findByCode(String code);
}
