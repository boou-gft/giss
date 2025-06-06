/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarAgenciaIncorporaDepartamentoResponse.java,v 1.1 2017/04/11 14:10:39 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarAgenciaIncorporaDepartamentoResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:39 $
 */
public class ListarAgenciaIncorporaDepartamentoResponse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _sinalReceitaTotal
     */
    private java.lang.String _sinalReceitaTotal;

    /**
     * Field _valorReceitaTotal
     */
    private java.math.BigDecimal _valorReceitaTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotal
     */
    private java.lang.String _sinalApuracaoTotal;

    /**
     * Field _valorApuracaoTotal
     */
    private java.math.BigDecimal _valorApuracaoTotal = new java.math.BigDecimal("0");

    /**
     * Field _ocorrenciasAgenciaIncorpList
     */
    private java.util.Vector<Object> _ocorrenciasAgenciaIncorpList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarAgenciaIncorporaDepartamentoResponse() 
     {
        super();
        setValorReceitaTotal(new java.math.BigDecimal("0"));
        setValorApuracaoTotal(new java.math.BigDecimal("0"));
        _ocorrenciasAgenciaIncorpList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param vOcorrenciasAgenciaIncorp
     */
    public void addOcorrenciasAgenciaIncorp(br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp vOcorrenciasAgenciaIncorp)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasAgenciaIncorpList.addElement(vOcorrenciasAgenciaIncorp);
    } //-- void addOcorrenciasAgenciaIncorp(br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) 

    /**
     * Method addOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasAgenciaIncorp
     */
    public void addOcorrenciasAgenciaIncorp(int index, br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp vOcorrenciasAgenciaIncorp)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasAgenciaIncorpList.insertElementAt(vOcorrenciasAgenciaIncorp, index);
    } //-- void addOcorrenciasAgenciaIncorp(int, br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasAgenciaIncorp()
    {
        return _ocorrenciasAgenciaIncorpList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasAgenciaIncorp() 

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
     * Method getOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasAgenciaIncorp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp getOcorrenciasAgenciaIncorp(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasAgenciaIncorpList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasAgenciaIncorp: Index value '"+index+"' not in range [0.."+(_ocorrenciasAgenciaIncorpList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) _ocorrenciasAgenciaIncorpList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp getOcorrenciasAgenciaIncorp(int) 

    /**
     * Method getOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @return OcorrenciasAgenciaIncorp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp[] getOcorrenciasAgenciaIncorp()
    {
        int size = _ocorrenciasAgenciaIncorpList.size();
        br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) _ocorrenciasAgenciaIncorpList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp[] getOcorrenciasAgenciaIncorp() 

    /**
     * Method getOcorrenciasAgenciaIncorpCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasAgenciaIncorpCount()
    {
        return _ocorrenciasAgenciaIncorpList.size();
    } //-- int getOcorrenciasAgenciaIncorpCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Returns the value of field 'sinalApuracaoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotal'.
     */
    public java.lang.String getSinalApuracaoTotal()
    {
        return this._sinalApuracaoTotal;
    } //-- java.lang.String getSinalApuracaoTotal() 

    /**
     * Returns the value of field 'sinalReceitaTotal'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotal'.
     */
    public java.lang.String getSinalReceitaTotal()
    {
        return this._sinalReceitaTotal;
    } //-- java.lang.String getSinalReceitaTotal() 

    /**
     * Returns the value of field 'valorApuracaoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotal'.
     */
    public java.math.BigDecimal getValorApuracaoTotal()
    {
        return this._valorApuracaoTotal;
    } //-- java.math.BigDecimal getValorApuracaoTotal() 

    /**
     * Returns the value of field 'valorReceitaTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaTotal'.
     */
    public java.math.BigDecimal getValorReceitaTotal()
    {
        return this._valorReceitaTotal;
    } //-- java.math.BigDecimal getValorReceitaTotal() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllOcorrenciasAgenciaIncorp
     * 
     */
    public void removeAllOcorrenciasAgenciaIncorp()
    {
        _ocorrenciasAgenciaIncorpList.removeAllElements();
    } //-- void removeAllOcorrenciasAgenciaIncorp() 

    /**
     * Method removeOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasAgenciaIncorp
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp removeOcorrenciasAgenciaIncorp(int index)
    {
        java.lang.Object obj = _ocorrenciasAgenciaIncorpList.elementAt(index);
        _ocorrenciasAgenciaIncorpList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp removeOcorrenciasAgenciaIncorp(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasAgenciaIncorp
     */
    public void setOcorrenciasAgenciaIncorp(int index, br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp vOcorrenciasAgenciaIncorp)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasAgenciaIncorpList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasAgenciaIncorp: Index value '"+index+"' not in range [0.." + (_ocorrenciasAgenciaIncorpList.size() - 1) + "]");
        }
        _ocorrenciasAgenciaIncorpList.setElementAt(vOcorrenciasAgenciaIncorp, index);
    } //-- void setOcorrenciasAgenciaIncorp(int, br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) 

    /**
     * Method setOcorrenciasAgenciaIncorp
     * 
     * 
     * 
     * @param ocorrenciasAgenciaIncorpArray
     */
    public void setOcorrenciasAgenciaIncorp(br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp[] ocorrenciasAgenciaIncorpArray)
    {
        //-- copy array
        _ocorrenciasAgenciaIncorpList.removeAllElements();
        for (int i = 0; i < ocorrenciasAgenciaIncorpArray.length; i++) {
            _ocorrenciasAgenciaIncorpList.addElement(ocorrenciasAgenciaIncorpArray[i]);
        }
    } //-- void setOcorrenciasAgenciaIncorp(br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.OcorrenciasAgenciaIncorp) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Sets the value of field 'sinalApuracaoTotal'.
     * 
     * @param sinalApuracaoTotal the value of field
     * 'sinalApuracaoTotal'.
     */
    public void setSinalApuracaoTotal(java.lang.String sinalApuracaoTotal)
    {
        this._sinalApuracaoTotal = sinalApuracaoTotal;
    } //-- void setSinalApuracaoTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotal'.
     * 
     * @param sinalReceitaTotal the value of field
     * 'sinalReceitaTotal'.
     */
    public void setSinalReceitaTotal(java.lang.String sinalReceitaTotal)
    {
        this._sinalReceitaTotal = sinalReceitaTotal;
    } //-- void setSinalReceitaTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracaoTotal'.
     * 
     * @param valorApuracaoTotal the value of field
     * 'valorApuracaoTotal'.
     */
    public void setValorApuracaoTotal(java.math.BigDecimal valorApuracaoTotal)
    {
        this._valorApuracaoTotal = valorApuracaoTotal;
    } //-- void setValorApuracaoTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaTotal'.
     * 
     * @param valorReceitaTotal the value of field
     * 'valorReceitaTotal'.
     */
    public void setValorReceitaTotal(java.math.BigDecimal valorReceitaTotal)
    {
        this._valorReceitaTotal = valorReceitaTotal;
    } //-- void setValorReceitaTotal(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarAgenciaIncorporaDepartamentoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.response.ListarAgenciaIncorporaDepartamentoResponse unmarshal(java.io.Reader) 

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
