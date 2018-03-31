package concerttours.dao.impl;

import concerttours.dao.BandDao;
import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DefaultBandDao implements BandDao {
    private static final String FIND_ALL_BANDS = "SELECT {" + BandModel.PK + "} "
            + "FROM {" + BandModel._TYPECODE + "}";
    private static final String FIND_BAND_BY_CODE = FIND_ALL_BANDS
            + " WHERE {" + BandModel.CODE + "} = ?" + BandModel.CODE;

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<BandModel> findAllBands() {
        return flexibleSearchService.search(FIND_ALL_BANDS)
                .getResult().stream()
                .filter(obj -> obj instanceof BandModel)
                .map(obj -> (BandModel) obj)
                .collect(Collectors.toList());
    }

    @Override
    public BandModel findByCode(String code) {
        final Map<String, Object> params = new HashMap<>();
        params.put(BandModel.CODE, code);
        return flexibleSearchService.searchUnique(new FlexibleSearchQuery(FIND_BAND_BY_CODE, params));
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
