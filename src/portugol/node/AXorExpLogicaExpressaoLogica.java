/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AXorExpLogicaExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoLogica _expressaoLogica_;
    private TXor _xor_;
    private PExpsLogicas _expsLogicas_;

    public AXorExpLogicaExpressaoLogica()
    {
        // Constructor
    }

    public AXorExpLogicaExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PExpsLogicas _expsLogicas_)
    {
        // Constructor
        setExpressaoLogica(_expressaoLogica_);

        setXor(_xor_);

        setExpsLogicas(_expsLogicas_);

    }

    @Override
    public Object clone()
    {
        return new AXorExpLogicaExpressaoLogica(
            cloneNode(this._expressaoLogica_),
            cloneNode(this._xor_),
            cloneNode(this._expsLogicas_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorExpLogicaExpressaoLogica(this);
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    public TXor getXor()
    {
        return this._xor_;
    }

    public void setXor(TXor node)
    {
        if(this._xor_ != null)
        {
            this._xor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xor_ = node;
    }

    public PExpsLogicas getExpsLogicas()
    {
        return this._expsLogicas_;
    }

    public void setExpsLogicas(PExpsLogicas node)
    {
        if(this._expsLogicas_ != null)
        {
            this._expsLogicas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expsLogicas_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoLogica_)
            + toString(this._xor_)
            + toString(this._expsLogicas_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        if(this._xor_ == child)
        {
            this._xor_ = null;
            return;
        }

        if(this._expsLogicas_ == child)
        {
            this._expsLogicas_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        if(this._xor_ == oldChild)
        {
            setXor((TXor) newChild);
            return;
        }

        if(this._expsLogicas_ == oldChild)
        {
            setExpsLogicas((PExpsLogicas) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
