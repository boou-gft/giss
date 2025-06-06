/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarMunicipioAliquotaDifResponse.java,v 1.1 2017/04/11 14:06:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarMunicipioAliquotaDifResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:06:59 $
 */
public class ListarMunicipioAliquotaDifResponse implements java.io.Serializable {
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
     * Field _ocorrenciasAliquotaList
     */
    private java.util.Vector<Object> _ocorrenciasAliquotaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarMunicipioAliquotaDifResponse() 
     {
        super();
        _ocorrenciasAliquotaList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasAliquota
     * 
     * 
     * 
     * @param vOcorrenciasAliquota
     */
    public void addOcorrenciasAliquota(br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota vOcorrenciasAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasAliquotaList.addElement(vOcorrenciasAliquota);
    } //-- void addOcorrenciasAliquota(br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) 

    /**
     * Method addOcorrenciasAliquota
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasAliquota
     */
    public void addOcorrenciasAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota vOcorrenciasAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasAliquotaList.insertElementAt(vOcorrenciasAliquota, index);
    } //-- void addOcorrenciasAliquota(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasAliquota
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasAliquota()
    {
        return _ocorrenciasAliquotaList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasAliquota() 

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
     * Method getOcorrenciasAliquota
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota getOcorrenciasAliquota(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasAliquotaList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasAliquota: Index value '"+index+"' not in range [0.."+(_ocorrenciasAliquotaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) _ocorrenciasAliquotaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota getOcorrenciasAliquota(int) 

    /**
     * Method getOcorrenciasAliquota
     * 
     * 
     * 
     * @return OcorrenciasAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota[] getOcorrenciasAliquota()
    {
        int size = _ocorrenciasAliquotaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) _ocorrenciasAliquotaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota[] getOcorrenciasAliquota() 

    /**
     * Method getOcorrenciasAliquotaCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasAliquotaCount()
    {
        return _ocorrenciasAliquotaList.size();
    } //-- int getOcorrenciasAliquotaCount() 

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
     * Method removeAllOcorrenciasAliquota
     * 
     */
    public void removeAllOcorrenciasAliquota()
    {
        _ocorrenciasAliquotaList.removeAllElements();
    } //-- void removeAllOcorrenciasAliquota() 

    /**
     * Method removeOcorrenciasAliquota
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasAliquota
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota removeOcorrenciasAliquota(int index)
    {
        java.lang.Object obj = _ocorrenciasAliquotaList.elementAt(index);
        _ocorrenciasAliquotaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota removeOcorrenciasAliquota(int) 

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
     * Method setOcorrenciasAliquota
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasAliquota
     */
    public void setOcorrenciasAliquota(int index, br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota vOcorrenciasAliquota)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasAliquotaList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasAliquota: Index value '"+index+"' not in range [0.." + (_ocorrenciasAliquotaList.size() - 1) + "]");
        }
        _ocorrenciasAliquotaList.setElementAt(vOcorrenciasAliquota, index);
    } //-- void setOcorrenciasAliquota(int, br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) 

    /**
     * Method setOcorrenciasAliquota
     * 
     * 
     * 
     * @param ocorrenciasAliquotaArray
     */
    public void setOcorrenciasAliquota(br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota[] ocorrenciasAliquotaArray)
    {
        //-- copy array
        _ocorrenciasAliquotaList.removeAllElements();
        for (int i = 0; i < ocorrenciasAliquotaArray.length; i++) {
            _ocorrenciasAliquotaList.addElement(ocorrenciasAliquotaArray[i]);
        }
    } //-- void setOcorrenciasAliquota(br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.OcorrenciasAliquota) 

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
     * @return ListarMunicipioAliquotaDifResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.response.ListarMunicipioAliquotaDifResponse unmarshal(java.io.Reader) 

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
