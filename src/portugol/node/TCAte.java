/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCAte extends Token
{
    public TCAte()
    {
        super.setText("ate");
    }

    public TCAte(int line, int pos)
    {
        super.setText("ate");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCAte(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCAte(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCAte text.");
    }
}
