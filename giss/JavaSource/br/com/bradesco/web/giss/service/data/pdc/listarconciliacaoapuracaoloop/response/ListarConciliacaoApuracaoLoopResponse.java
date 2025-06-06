/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarConciliacaoApuracaoLoopResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarConciliacaoApuracaoLoopResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _sinalReceitaTotalCCRS
     */
    private java.lang.String _sinalReceitaTotalCCRS;

    /**
     * Field _valorReceitaTotalCCRS
     */
    private double _valorReceitaTotalCCRS = 0;

    /**
     * keeps track of state for field: _valorReceitaTotalCCRS
     */
    private boolean _has_valorReceitaTotalCCRS;

    /**
     * Field _sinalReceitaTotalGISS
     */
    private java.lang.String _sinalReceitaTotalGISS;

    /**
     * Field _valorReceitaTotalGISS
     */
    private double _valorReceitaTotalGISS = 0;

    /**
     * keeps track of state for field: _valorReceitaTotalGISS
     */
    private boolean _has_valorReceitaTotalGISS;

    /**
     * Field _sinalAjusteTotal
     */
    private java.lang.String _sinalAjusteTotal;

    /**
     * Field _valorAjusteTotal
     */
    private double _valorAjusteTotal = 0;

    /**
     * keeps track of state for field: _valorAjusteTotal
     */
    private boolean _has_valorAjusteTotal;

    /**
     * Field _sinalIssTotal
     */
    private java.lang.String _sinalIssTotal;

    /**
     * Field _valorIssTotal
     */
    private double _valorIssTotal = 0;

    /**
     * keeps track of state for field: _valorIssTotal
     */
    private boolean _has_valorIssTotal;

    /**
     * Field _sinalAliquotaZeradaTotal
     */
    private java.lang.String _sinalAliquotaZeradaTotal;

    /**
     * Field _valorAliquotaZeradaTotal
     */
    private double _valorAliquotaZeradaTotal = 0;

    /**
     * keeps track of state for field: _valorAliquotaZeradaTotal
     */
    private boolean _has_valorAliquotaZeradaTotal;

    /**
     * Field _sinalOscilacaoNegativaTotal
     */
    private java.lang.String _sinalOscilacaoNegativaTotal;

    /**
     * Field _valorOscilacaoNegativaTotal
     */
    private double _valorOscilacaoNegativaTotal = 0;

    /**
     * keeps track of state for field: _valorOscilacaoNegativaTotal
     */
    private boolean _has_valorOscilacaoNegativaTotal;

    /**
     * Field _sinalRedutorTotal
     */
    private java.lang.String _sinalRedutorTotal;

    /**
     * Field _valorRedutosTotal
     */
    private double _valorRedutosTotal = 0;

    /**
     * keeps track of state for field: _valorRedutosTotal
     */
    private boolean _has_valorRedutosTotal;

    /**
     * Field _listaList
     */
    private java.util.Vector _listaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarConciliacaoApuracaoLoopResponse() 
     {
        super();
        _listaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLista
     * 
     * 
     * 
     * @param vLista
     */
    public void addLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.addElement(vLista);
    } //-- void addLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) 

    /**
     * Method addLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void addLista(int index, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.insertElementAt(vLista, index);
    } //-- void addLista(int, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method deleteValorAjusteTotal
     * 
     */
    public void deleteValorAjusteTotal()
    {
        this._has_valorAjusteTotal= false;
    } //-- void deleteValorAjusteTotal() 

    /**
     * Method deleteValorAliquotaZeradaTotal
     * 
     */
    public void deleteValorAliquotaZeradaTotal()
    {
        this._has_valorAliquotaZeradaTotal= false;
    } //-- void deleteValorAliquotaZeradaTotal() 

    /**
     * Method deleteValorIssTotal
     * 
     */
    public void deleteValorIssTotal()
    {
        this._has_valorIssTotal= false;
    } //-- void deleteValorIssTotal() 

    /**
     * Method deleteValorOscilacaoNegativaTotal
     * 
     */
    public void deleteValorOscilacaoNegativaTotal()
    {
        this._has_valorOscilacaoNegativaTotal= false;
    } //-- void deleteValorOscilacaoNegativaTotal() 

    /**
     * Method deleteValorReceitaTotalCCRS
     * 
     */
    public void deleteValorReceitaTotalCCRS()
    {
        this._has_valorReceitaTotalCCRS= false;
    } //-- void deleteValorReceitaTotalCCRS() 

    /**
     * Method deleteValorReceitaTotalGISS
     * 
     */
    public void deleteValorReceitaTotalGISS()
    {
        this._has_valorReceitaTotalGISS= false;
    } //-- void deleteValorReceitaTotalGISS() 

    /**
     * Method deleteValorRedutosTotal
     * 
     */
    public void deleteValorRedutosTotal()
    {
        this._has_valorRedutosTotal= false;
    } //-- void deleteValorRedutosTotal() 

    /**
     * Method enumerateLista
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLista()
    {
        return _listaList.elements();
    } //-- java.util.Enumeration enumerateLista() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Method getLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista getLista(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("getLista: Index value '"+index+"' not in range [0.."+(_listaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) _listaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista getLista(int) 

    /**
     * Method getLista
     * 
     * 
     * 
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista[] getLista()
    {
        int size = _listaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) _listaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista[] getLista() 

    /**
     * Method getListaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCount()
    {
        return _listaList.size();
    } //-- int getListaCount() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'numConsultas'.
     * 
     * @return int
     * @return the value of field 'numConsultas'.
     */
    public int getNumConsultas()
    {
        return this._numConsultas;
    } //-- int getNumConsultas() 

    /**
     * Returns the value of field 'sinalAjusteTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAjusteTotal'.
     */
    public java.lang.String getSinalAjusteTotal()
    {
        return this._sinalAjusteTotal;
    } //-- java.lang.String getSinalAjusteTotal() 

    /**
     * Returns the value of field 'sinalAliquotaZeradaTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAliquotaZeradaTotal'.
     */
    public java.lang.String getSinalAliquotaZeradaTotal()
    {
        return this._sinalAliquotaZeradaTotal;
    } //-- java.lang.String getSinalAliquotaZeradaTotal() 

    /**
     * Returns the value of field 'sinalIssTotal'.
     * 
     * @return String
     * @return the value of field 'sinalIssTotal'.
     */
    public java.lang.String getSinalIssTotal()
    {
        return this._sinalIssTotal;
    } //-- java.lang.String getSinalIssTotal() 

    /**
     * Returns the value of field 'sinalOscilacaoNegativaTotal'.
     * 
     * @return String
     * @return the value of field 'sinalOscilacaoNegativaTotal'.
     */
    public java.lang.String getSinalOscilacaoNegativaTotal()
    {
        return this._sinalOscilacaoNegativaTotal;
    } //-- java.lang.String getSinalOscilacaoNegativaTotal() 

    /**
     * Returns the value of field 'sinalReceitaTotalCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalCCRS'.
     */
    public java.lang.String getSinalReceitaTotalCCRS()
    {
        return this._sinalReceitaTotalCCRS;
    } //-- java.lang.String getSinalReceitaTotalCCRS() 

    /**
     * Returns the value of field 'sinalReceitaTotalGISS'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalGISS'.
     */
    public java.lang.String getSinalReceitaTotalGISS()
    {
        return this._sinalReceitaTotalGISS;
    } //-- java.lang.String getSinalReceitaTotalGISS() 

    /**
     * Returns the value of field 'sinalRedutorTotal'.
     * 
     * @return String
     * @return the value of field 'sinalRedutorTotal'.
     */
    public java.lang.String getSinalRedutorTotal()
    {
        return this._sinalRedutorTotal;
    } //-- java.lang.String getSinalRedutorTotal() 

    /**
     * Returns the value of field 'valorAjusteTotal'.
     * 
     * @return double
     * @return the value of field 'valorAjusteTotal'.
     */
    public double getValorAjusteTotal()
    {
        return this._valorAjusteTotal;
    } //-- double getValorAjusteTotal() 

    /**
     * Returns the value of field 'valorAliquotaZeradaTotal'.
     * 
     * @return double
     * @return the value of field 'valorAliquotaZeradaTotal'.
     */
    public double getValorAliquotaZeradaTotal()
    {
        return this._valorAliquotaZeradaTotal;
    } //-- double getValorAliquotaZeradaTotal() 

    /**
     * Returns the value of field 'valorIssTotal'.
     * 
     * @return double
     * @return the value of field 'valorIssTotal'.
     */
    public double getValorIssTotal()
    {
        return this._valorIssTotal;
    } //-- double getValorIssTotal() 

    /**
     * Returns the value of field 'valorOscilacaoNegativaTotal'.
     * 
     * @return double
     * @return the value of field 'valorOscilacaoNegativaTotal'.
     */
    public double getValorOscilacaoNegativaTotal()
    {
        return this._valorOscilacaoNegativaTotal;
    } //-- double getValorOscilacaoNegativaTotal() 

    /**
     * Returns the value of field 'valorReceitaTotalCCRS'.
     * 
     * @return double
     * @return the value of field 'valorReceitaTotalCCRS'.
     */
    public double getValorReceitaTotalCCRS()
    {
        return this._valorReceitaTotalCCRS;
    } //-- double getValorReceitaTotalCCRS() 

    /**
     * Returns the value of field 'valorReceitaTotalGISS'.
     * 
     * @return double
     * @return the value of field 'valorReceitaTotalGISS'.
     */
    public double getValorReceitaTotalGISS()
    {
        return this._valorReceitaTotalGISS;
    } //-- double getValorReceitaTotalGISS() 

    /**
     * Returns the value of field 'valorRedutosTotal'.
     * 
     * @return double
     * @return the value of field 'valorRedutosTotal'.
     */
    public double getValorRedutosTotal()
    {
        return this._valorRedutosTotal;
    } //-- double getValorRedutosTotal() 

    /**
     * Method hasNumConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsultas()
    {
        return this._has_numConsultas;
    } //-- boolean hasNumConsultas() 

    /**
     * Method hasValorAjusteTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorAjusteTotal()
    {
        return this._has_valorAjusteTotal;
    } //-- boolean hasValorAjusteTotal() 

    /**
     * Method hasValorAliquotaZeradaTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorAliquotaZeradaTotal()
    {
        return this._has_valorAliquotaZeradaTotal;
    } //-- boolean hasValorAliquotaZeradaTotal() 

    /**
     * Method hasValorIssTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorIssTotal()
    {
        return this._has_valorIssTotal;
    } //-- boolean hasValorIssTotal() 

    /**
     * Method hasValorOscilacaoNegativaTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorOscilacaoNegativaTotal()
    {
        return this._has_valorOscilacaoNegativaTotal;
    } //-- boolean hasValorOscilacaoNegativaTotal() 

    /**
     * Method hasValorReceitaTotalCCRS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceitaTotalCCRS()
    {
        return this._has_valorReceitaTotalCCRS;
    } //-- boolean hasValorReceitaTotalCCRS() 

    /**
     * Method hasValorReceitaTotalGISS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceitaTotalGISS()
    {
        return this._has_valorReceitaTotalGISS;
    } //-- boolean hasValorReceitaTotalGISS() 

    /**
     * Method hasValorRedutosTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorRedutosTotal()
    {
        return this._has_valorRedutosTotal;
    } //-- boolean hasValorRedutosTotal() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllLista
     * 
     */
    public void removeAllLista()
    {
        _listaList.removeAllElements();
    } //-- void removeAllLista() 

    /**
     * Method removeLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista removeLista(int index)
    {
        java.lang.Object obj = _listaList.elementAt(index);
        _listaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista removeLista(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void setLista(int index, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("setLista: Index value '"+index+"' not in range [0.." + (_listaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setLista has a maximum of 100");
        }
        _listaList.setElementAt(vLista, index);
    } //-- void setLista(int, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param listaArray
     */
    public void setLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista[] listaArray)
    {
        //-- copy array
        _listaList.removeAllElements();
        for (int i = 0; i < listaArray.length; i++) {
            _listaList.addElement(listaArray[i]);
        }
    } //-- void setLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numConsultas'.
     * 
     * @param numConsultas the value of field 'numConsultas'.
     */
    public void setNumConsultas(int numConsultas)
    {
        this._numConsultas = numConsultas;
        this._has_numConsultas = true;
    } //-- void setNumConsultas(int) 

    /**
     * Sets the value of field 'sinalAjusteTotal'.
     * 
     * @param sinalAjusteTotal the value of field 'sinalAjusteTotal'
     */
    public void setSinalAjusteTotal(java.lang.String sinalAjusteTotal)
    {
        this._sinalAjusteTotal = sinalAjusteTotal;
    } //-- void setSinalAjusteTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalAliquotaZeradaTotal'.
     * 
     * @param sinalAliquotaZeradaTotal the value of field
     * 'sinalAliquotaZeradaTotal'.
     */
    public void setSinalAliquotaZeradaTotal(java.lang.String sinalAliquotaZeradaTotal)
    {
        this._sinalAliquotaZeradaTotal = sinalAliquotaZeradaTotal;
    } //-- void setSinalAliquotaZeradaTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalIssTotal'.
     * 
     * @param sinalIssTotal the value of field 'sinalIssTotal'.
     */
    public void setSinalIssTotal(java.lang.String sinalIssTotal)
    {
        this._sinalIssTotal = sinalIssTotal;
    } //-- void setSinalIssTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalOscilacaoNegativaTotal'.
     * 
     * @param sinalOscilacaoNegativaTotal the value of field
     * 'sinalOscilacaoNegativaTotal'.
     */
    public void setSinalOscilacaoNegativaTotal(java.lang.String sinalOscilacaoNegativaTotal)
    {
        this._sinalOscilacaoNegativaTotal = sinalOscilacaoNegativaTotal;
    } //-- void setSinalOscilacaoNegativaTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalCCRS'.
     * 
     * @param sinalReceitaTotalCCRS the value of field
     * 'sinalReceitaTotalCCRS'.
     */
    public void setSinalReceitaTotalCCRS(java.lang.String sinalReceitaTotalCCRS)
    {
        this._sinalReceitaTotalCCRS = sinalReceitaTotalCCRS;
    } //-- void setSinalReceitaTotalCCRS(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalGISS'.
     * 
     * @param sinalReceitaTotalGISS the value of field
     * 'sinalReceitaTotalGISS'.
     */
    public void setSinalReceitaTotalGISS(java.lang.String sinalReceitaTotalGISS)
    {
        this._sinalReceitaTotalGISS = sinalReceitaTotalGISS;
    } //-- void setSinalReceitaTotalGISS(java.lang.String) 

    /**
     * Sets the value of field 'sinalRedutorTotal'.
     * 
     * @param sinalRedutorTotal the value of field
     * 'sinalRedutorTotal'.
     */
    public void setSinalRedutorTotal(java.lang.String sinalRedutorTotal)
    {
        this._sinalRedutorTotal = sinalRedutorTotal;
    } //-- void setSinalRedutorTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorAjusteTotal'.
     * 
     * @param valorAjusteTotal the value of field 'valorAjusteTotal'
     */
    public void setValorAjusteTotal(double valorAjusteTotal)
    {
        this._valorAjusteTotal = valorAjusteTotal;
        this._has_valorAjusteTotal = true;
    } //-- void setValorAjusteTotal(double) 

    /**
     * Sets the value of field 'valorAliquotaZeradaTotal'.
     * 
     * @param valorAliquotaZeradaTotal the value of field
     * 'valorAliquotaZeradaTotal'.
     */
    public void setValorAliquotaZeradaTotal(double valorAliquotaZeradaTotal)
    {
        this._valorAliquotaZeradaTotal = valorAliquotaZeradaTotal;
        this._has_valorAliquotaZeradaTotal = true;
    } //-- void setValorAliquotaZeradaTotal(double) 

    /**
     * Sets the value of field 'valorIssTotal'.
     * 
     * @param valorIssTotal the value of field 'valorIssTotal'.
     */
    public void setValorIssTotal(double valorIssTotal)
    {
        this._valorIssTotal = valorIssTotal;
        this._has_valorIssTotal = true;
    } //-- void setValorIssTotal(double) 

    /**
     * Sets the value of field 'valorOscilacaoNegativaTotal'.
     * 
     * @param valorOscilacaoNegativaTotal the value of field
     * 'valorOscilacaoNegativaTotal'.
     */
    public void setValorOscilacaoNegativaTotal(double valorOscilacaoNegativaTotal)
    {
        this._valorOscilacaoNegativaTotal = valorOscilacaoNegativaTotal;
        this._has_valorOscilacaoNegativaTotal = true;
    } //-- void setValorOscilacaoNegativaTotal(double) 

    /**
     * Sets the value of field 'valorReceitaTotalCCRS'.
     * 
     * @param valorReceitaTotalCCRS the value of field
     * 'valorReceitaTotalCCRS'.
     */
    public void setValorReceitaTotalCCRS(double valorReceitaTotalCCRS)
    {
        this._valorReceitaTotalCCRS = valorReceitaTotalCCRS;
        this._has_valorReceitaTotalCCRS = true;
    } //-- void setValorReceitaTotalCCRS(double) 

    /**
     * Sets the value of field 'valorReceitaTotalGISS'.
     * 
     * @param valorReceitaTotalGISS the value of field
     * 'valorReceitaTotalGISS'.
     */
    public void setValorReceitaTotalGISS(double valorReceitaTotalGISS)
    {
        this._valorReceitaTotalGISS = valorReceitaTotalGISS;
        this._has_valorReceitaTotalGISS = true;
    } //-- void setValorReceitaTotalGISS(double) 

    /**
     * Sets the value of field 'valorRedutosTotal'.
     * 
     * @param valorRedutosTotal the value of field
     * 'valorRedutosTotal'.
     */
    public void setValorRedutosTotal(double valorRedutosTotal)
    {
        this._valorRedutosTotal = valorRedutosTotal;
        this._has_valorRedutosTotal = true;
    } //-- void setValorRedutosTotal(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarConciliacaoApuracaoLoopResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.ListarConciliacaoApuracaoLoopResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
