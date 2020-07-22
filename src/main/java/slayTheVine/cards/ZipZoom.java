package slayTheVine.cards;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class ZipZoom extends AbstractVineCard {

    int damage = 5;
    int damagePlusAmt = 2;

    //all hardcoded bc I don't have the brain power rn to make this read JSON
    final String ID = "slayTheVine:ZipZoom";
    final String NAME = "Zip Zoom";
    final String IMG = "img/cards/ZipZoom.png";
    final int COST = 1;
    final String DESCRIPTION = "Deal " + damage + " damage twice";
    final CardType TYPE = CardType.ATTACK;
    final CardColor COLOR = CardColor.COLORLESS; //colorless until I implement a character and a color
    final CardRarity RARITY = CardRarity.BASIC;
    final CardTarget TARGET = CardTarget.ENEMY;

    public ZipZoom() {
        super(ID, NAME, IMG, COST, DESCRIPTION, TYPE, COLOR, RARITY, TARGET);
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom(new DamageAction(m, new DamageInfo((p, this.damage,
                this.damageTypeForTurn), AbstractGameAction.AttackEffect.SLASH_HORIZONTAL));
        AbstractDungeon.actionManager.addToBottom(new DamageAction(m, new DamageInfo((p, this.damage,
                this.damageTypeForTurn), AbstractGameAction.AttackEffect.SLASH_HORIZONTAL));
    }

    //increase damage dealt
    @Override
    public void upgrade() {
        if (!upgraded) {
            upgradeName();
            upgradeDamage(damagePlusAmt);
            initializeDescription();
        }
    }
}
