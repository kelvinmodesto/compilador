/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACasoCaso extends PCaso
{
    private TCCaso _cCaso_;
    private PValor _valor_;
    private TDoisPontos _doisPontos_;
    private PComandos _comandos_;

    public ACasoCaso()
    {
        // Constructor
    }

    public ACasoCaso(
        @SuppressWarnings("hiding") TCCaso _cCaso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") PComandos _comandos_)
    {
        // Constructor
        setCCaso(_cCaso_);

        setValor(_valor_);

        setDoisPontos(_doisPontos_);

        setComandos(_comandos_);

    }

    @Override
    public Object clone()
    {
        return new ACasoCaso(
            cloneNode(this._cCaso_),
            cloneNode(this._valor_),
            cloneNode(this._doisPontos_),
            cloneNode(this._comandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACasoCaso(this);
    }

    public TCCaso getCCaso()
    {
        return this._cCaso_;
    }

    public void setCCaso(TCCaso node)
    {
        if(this._cCaso_ != null)
        {
            this._cCaso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cCaso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TDoisPontos getDoisPontos()
    {
        return this._doisPontos_;
    }

    public void setDoisPontos(TDoisPontos node)
    {
        if(this._doisPontos_ != null)
        {
            this._doisPontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPontos_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cCaso_)
            + toString(this._valor_)
            + toString(this._doisPontos_)
            + toString(this._comandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cCaso_ == child)
        {
            this._cCaso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cCaso_ == oldChild)
        {
            setCCaso((TCCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}