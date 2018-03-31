package concerttours.service.impl;

import concerttours.dao.BandDao;
import concerttours.model.BandModel;
import concerttours.service.BandService;

import java.util.List;

public class DefaultBandService implements BandService {
    private BandDao bandDao;

    @Override
    public List<BandModel> getBands() {
        return bandDao.findAllBands();
    }

    public void setBandDao(BandDao bandDao) {
        this.bandDao = bandDao;
    }
}
