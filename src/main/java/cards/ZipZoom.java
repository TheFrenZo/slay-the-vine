package cards;

import basemod.abstracts.CustomCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class ZipZoom extends CustomCard {

    public ZipZoom(String id, String name, String img, int cost, String rawDescription, CardType type, CardColor color,
                   CardRarity rarity, CardTarget target) {
        super(id, name, img, cost, rawDescription, type, color, rarity, target);
    }

    public void use(AbstractPlayer player, AbstractMonster target) {

    }

    @Override
    public void upgrade() {

    }
}
