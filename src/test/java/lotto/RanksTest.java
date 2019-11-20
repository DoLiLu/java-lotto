package lotto;

import lotto.domain.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RanksTest {

    @Test
    void ranksCountTest() {
        List<Rank> ranksInit = new ArrayList<>();
        ranksInit.add(Rank.FIRST);
        ranksInit.add(Rank.THIRD);
        ranksInit.add(Rank.FIRST);
        ranksInit.add(Rank.FIRST);
        int[] winLotto = new int[] {1, 2, 3, 4, 5, 6};
        List<String> manualLotto = Arrays.asList("1, 2, 3, 4, 5, 8");
        Lottos lottos = new LottosMaker().generate(manualLotto);
        WinningRank winningRank = new WinningRank(winLotto, 8);
        Ranks ranks = new Ranks(winningRank, lottos);
        assertThat(ranks.getRanks()).contains(Rank.SECOND);
    }
}
