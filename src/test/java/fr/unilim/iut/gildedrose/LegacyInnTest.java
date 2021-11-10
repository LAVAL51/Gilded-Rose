package fr.unilim.iut.gildedrose;

import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class LegacyInnTest {

    @Test
    public void should_test_against_legacy_code(){
        LegacyInn legacyInn = new LegacyInn();
        Inn inn = new Inn();

        for (int day = 0; day < 1000; day++){
            List<Item> items = inn.getItems();
            List<Item> legacyItems = legacyInn.getItems();

            assertThat(items).hasSize(legacyItems.size());
            for(int i = 0; i < legacyItems.size(); i++){
                Item item = items.get(i);
                Item legacyItem = legacyItems.get(i);

                assertThat(item.getName()).isEqualTo(legacyItem.getName());
                assertThat(item.getQuality()).isEqualTo(legacyItem.getQuality());
                assertThat(item.getSellIn()).isEqualTo(legacyItem.getSellIn());
            }
        }
        inn.updateQuality();
        legacyInn.updateQuality();
    }
}
