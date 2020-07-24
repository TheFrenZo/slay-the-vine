package slayTheVine.cards;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.actions.common.DamageRandomEnemyAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import slayTheVine.SlayTheVine;

public class ZipZoom extends AbstractVineCard {

    int damage = 5;

    final String ID = "slayTheVine:ZipZoom";
    final String IMG= "img/cards/zipzoom/zipzoom.png";
    final CardStrings CARD_STRINGS = CardCrawlGame.languagePack.getCardStrings(ID);
    final String NAME = CARD_STRINGS.NAME;
    final String DESCRIPTION = CARD_STRINGS.DESCRIPTION;
    final CardType TYPE = CardType.ATTACK;
    final CardColor COLOR = SlayTheVine.VINE_COLOR;
    final CardRarity RARITY = CardRarity.COMMON;
    final CardTarget TARGET = CardTarget.ENEMY;

    int COST = 2;

    public ZipZoom() {
        super(ID, NAME, IMG, COST, DESCRIPTION, TYPE, COLOR, RARITY, TARGET);
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom(new DamageAction(m, new DamageInfo((p, this.damage,
                this.damageTypeForTurn), AbstractGameAction.AttackEffect.SLASH_HORIZONTAL));
        AbstractDungeon.actionManager.addToBottom(new DamageRandomEnemyAction(new DamageInfo(p, this.damage,
                this.damageTypeForTurn), AbstractGameAction.AttackEffect.SLASH_HORIZONTAL));
    }

    @Override
    public AbstractCard makeCopy() {
        return new ZipZoom();
    }

    //increase damage dealt
    @Override
    public void upgrade() {
        if (!upgraded) {
            upgradeName();
            upgradeDamage(3);
            initializeDescription();
        }
    }
}
