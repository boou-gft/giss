/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaMunicipioResponse.java,v 1.1 2017/04/11 14:06:56 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListaMunicipioResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:06:56 $
 */
public class ListaMunicipioResponse implements java.io.Serializable {
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
     * Field _codPais
     */
    private java.lang.String _codPais;

    /**
     * Field _descPais
     */
    private java.lang.String _descPais;

    /**
     * Field _ocorrenciasListaMunicipioList
     */
    private java.util.Vector<Object> _ocorrenciasListaMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaMunicipioResponse() 
     {
        super();
        _ocorrenciasListaMunicipioList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param vOcorrenciasListaMunicipio
     */
    public void addOcorrenciasListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio vOcorrenciasListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasListaMunicipioList.addElement(vOcorrenciasListaMunicipio);
    } //-- void addOcorrenciasListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) 

    /**
     * Method addOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasListaMunicipio
     */
    public void addOcorrenciasListaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio vOcorrenciasListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasListaMunicipioList.insertElementAt(vOcorrenciasListaMunicipio, index);
    } //-- void addOcorrenciasListaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasListaMunicipio()
    {
        return _ocorrenciasListaMunicipioList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasListaMunicipio() 

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
     * Returns the value of field 'codPais'.
     * 
     * @return String
     * @return the value of field 'codPais'.
     */
    public java.lang.String getCodPais()
    {
        return this._codPais;
    } //-- java.lang.String getCodPais() 

    /**
     * Returns the value of field 'descPais'.
     * 
     * @return String
     * @return the value of field 'descPais'.
     */
    public java.lang.String getDescPais()
    {
        return this._descPais;
    } //-- java.lang.String getDescPais() 

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
     * Method getOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio getOcorrenciasListaMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasListaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasListaMunicipio: Index value '"+index+"' not in range [0.."+(_ocorrenciasListaMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) _ocorrenciasListaMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio getOcorrenciasListaMunicipio(int) 

    /**
     * Method getOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @return OcorrenciasListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio[] getOcorrenciasListaMunicipio()
    {
        int size = _ocorrenciasListaMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) _ocorrenciasListaMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio[] getOcorrenciasListaMunicipio() 

    /**
     * Method getOcorrenciasListaMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasListaMunicipioCount()
    {
        return _ocorrenciasListaMunicipioList.size();
    } //-- int getOcorrenciasListaMunicipioCount() 

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
     * Method removeAllOcorrenciasListaMunicipio
     * 
     */
    public void removeAllOcorrenciasListaMunicipio()
    {
        _ocorrenciasListaMunicipioList.removeAllElements();
    } //-- void removeAllOcorrenciasListaMunicipio() 

    /**
     * Method removeOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasListaMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio removeOcorrenciasListaMunicipio(int index)
    {
        java.lang.Object obj = _ocorrenciasListaMunicipioList.elementAt(index);
        _ocorrenciasListaMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio removeOcorrenciasListaMunicipio(int) 

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
     * Sets the value of field 'codPais'.
     * 
     * @param codPais the value of field 'codPais'.
     */
    public void setCodPais(java.lang.String codPais)
    {
        this._codPais = codPais;
    } //-- void setCodPais(java.lang.String) 

    /**
     * Sets the value of field 'descPais'.
     * 
     * @param descPais the value of field 'descPais'.
     */
    public void setDescPais(java.lang.String descPais)
    {
        this._descPais = descPais;
    } //-- void setDescPais(java.lang.String) 

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
     * Method setOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasListaMunicipio
     */
    public void setOcorrenciasListaMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio vOcorrenciasListaMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasListaMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasListaMunicipio: Index value '"+index+"' not in range [0.." + (_ocorrenciasListaMunicipioList.size() - 1) + "]");
        }
        _ocorrenciasListaMunicipioList.setElementAt(vOcorrenciasListaMunicipio, index);
    } //-- void setOcorrenciasListaMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) 

    /**
     * Method setOcorrenciasListaMunicipio
     * 
     * 
     * 
     * @param ocorrenciasListaMunicipioArray
     */
    public void setOcorrenciasListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio[] ocorrenciasListaMunicipioArray)
    {
        //-- copy array
        _ocorrenciasListaMunicipioList.removeAllElements();
        for (int i = 0; i < ocorrenciasListaMunicipioArray.length; i++) {
            _ocorrenciasListaMunicipioList.addElement(ocorrenciasListaMunicipioArray[i]);
        }
    } //-- void setOcorrenciasListaMunicipio(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaMunicipioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.ListaMunicipioResponse unmarshal(java.io.Reader) 

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
