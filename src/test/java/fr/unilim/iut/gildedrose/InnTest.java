package fr.unilim.iut.gildedrose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InnTest {
  @Test
  public void should_list_tests() {
    assertThat(new Inn().getItems()).extracting("name").containsExactly("+5 Dexterity Vest",
                                                                                     "Aged Brie",
                                                                                     "Elixir of the Mongoose",
                                                                                     "Sulfuras, Hand of Ragnaros",
                                                                                     "Backstage passes to a TAFKAL80ETC concert",
                                                                                     "Conjured Mana Cake");
    assertThat(new Inn().getItems()).extracting("sellIn").containsExactly(10, 2, 5, 0, 15, 3);
    assertThat(new Inn().getItems()).extracting("quality").containsExactly(20, 0, 7, 80, 20, 6);
  }

}
